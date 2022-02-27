def ANDROID_RECP

pipeline
{
    agent { label 'label-master'}

    tools
    {
        jdk 'OPENJDK11'
        gradle 'GRADLE'
        git 'GIT'
        maven 'MAVEN'
    }

    environment
    {
        JAVA_HOME="/usr/local/Cellar/openjdk@11/11.0.12/libexec/openjdk.jdk/Contents/Home"   
        SCANNER="/Applications/sonar-scanner"
        ANDROID_BUILD_TOOLS="/Users/rm2652/Library/Android/sdk/build-tools/31.0.0"
    }
  
    parameters
    {
      string description: 'Contains the Job name', name: 'FROM_JOB_NAME'
      string description: 'Contains the Build Number', name: 'FROM_BUILD_NUMBER'
    } 

    stages
    {
        stage('Loading Pipeline Properties')
        {
            steps
            {
                script
                {
                    def properties = readProperties file: 'pipeline.properties'
                    ANDROID_RECP = properties['ANDROID_RECP']
                }
            }
        }

        stage('Execute QA Automated Test Scripts for Manually Selected Branch')
        {
            when 
            {
                allOf
                {
                    expression { params.FROM_JOB_NAME == 'Arris_Android_Manually_Build_Any_Branch_Or_Tag_EXP' }
                    expression { params.QA_AUTOMATION  == true }
                }
            }

            steps
            {
                echo '===== Automated Test Started ====='
                
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') 
                {
                	sh """
                   		/Users/rm2652/Library/Android/sdk/platform-tools/adb devices
                        /Users/rm2652/Library/Android/sdk/platform-tools/adb install -r --no-incremental /Users/rm2652/Downloads/app-staging-signed.apk
                   		mvn -f /Users/rm2652/.jenkins/workspace/Arris_Android_QA_Automation_W31_BOBA/pom.xml test -PAndroid
                		"""   
                }
                
                echo '=====Automated Test Completed====='
            }
        }

        stage('Execute QA Automated Test Scripts for Master Branch')
        {
            when 
            {
                allOf
                {
                    expression { params.FROM_JOB_NAME == 'Arris_Android_Master_Branch_3am_Auto_Build' }
                    expression { params.QA_AUTOMATION  == true }
                }
            }

            steps
            {
                echo '===== Automated Test Started ====='
                
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') 
                {
                	sh """
                    	/Users/rm2652/Library/Android/sdk/platform-tools/adb devices
                        /Users/rm2652/Library/Android/sdk/platform-tools/adb install -r --no-incremental /Users/rm2652/.jenkins/jobs/${FROM_JOB_NAME}/builds/${FROM_BUILD_NUMBER}/archive/ArrisSURFboardCentral/app/build/outputs/apk/staging/debug/app-staging-debug.apk
                    	mvn -f /Users/rm2652/.jenkins/workspace/Arris_Android_QA_Automation_W31_BOBA/pom.xml test -PAndroid
               		 """       
                }
                echo '=====Automated Test Completed====='
            }
        }

        stage('Publish Reports')
        {
            steps
            {
                echo '=====Publish QA ReportNG Report====='
                    publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: true, 
                    reportDir: 'mvn -f /Users/rm2652/.jenkins/workspace/Arris_Android_QA_Automation_W31_BOBA/pom.xml test -PAndroid/target/surefire-reports/html', reportFiles: 'index.html', 
                    reportName: 'W31 Android Onboarding BOBA', reportTitles: 'Arris SURFboard App'])

                    zip archive: true, dir: '/Users/rm2652/.jenkins/workspace/Arris_Android_QA_Automation_W31_BOBA/target/surefire-reports/html', zipFile: 'W31_Android_Onboarding_BOBA_'+env.BUILD_NUMBER+'.zip'

                //junit allowEmptyResults: true, testResults: '**/build/test-results/**/*.xml', skipPublishingChecks: true
             }
        }
    }

    post
    {
        success
        {
            echo 'Jenkins job ' + env.JOB_NAME + ' ' + env.BUILD_NUMBER +' '+ env.BUILD_TIMESTAMP + ' - SUCCESS '                
            emailext body: '''${SCRIPT, template="groovy-html.template"}''',
            subject: 'Job \'${JOB_NAME}\' - (${BUILD_NUMBER}) - \'${BUILD_TIMESTAMP}\' -  SUCCESS',
            mimeType: 'text/html',
            to: 'prabhu.rajarathinam@mobileprogramming.com'
            //to: "${ANDROID_RECP}"
        }

        failure
        {
            echo 'Jenkins job ' + env.JOB_NAME + ' ' + env.BUILD_NUMBER +' '+ env.BUILD_TIMESTAMP + ' - FAILED ' 
            emailext body: '''${SCRIPT, template="groovy-html.template"}''', 
            subject: 'Job \'${JOB_NAME}\' - (${BUILD_NUMBER}) - \'${BUILD_TIMESTAMP}\' - FAILED',
            mimeType: 'text/html',
            attachLog: true, 
            to: 'prabhu.rajarathinam@mobileprogramming.com'
            //to: "${ANDROID_RECP}"
        }

        unstable
        {
            echo 'Jenkins job ' + env.JOB_NAME + ' ' + env.BUILD_NUMBER +' '+ env.BUILD_TIMESTAMP + ' - UNSTABLE ' 
            emailext body: '''${SCRIPT, template="groovy-html.template"}''', 
            subject: 'Job \'${JOB_NAME}\' - (${BUILD_NUMBER}) - \'${BUILD_TIMESTAMP}\' - UNSTABLE',
            mimeType: 'text/html',
            attachLog: true, 
            to: 'prabhu.rajarathinam@mobileprogramming.com'
            //to: "${ANDROID_RECP}"
        }
    }
}
