pipeline {
           agent {
               label 'maven'
        }
        stages {
                 stage ('checkoutSCM') {
                     steps {
                         git branch: 'main', credentialsId: 'jenkins-mavenfinal', url: 'https://github.com/kumardutt/javawebapp.git'
                           }
                                       }
        stage ('build') {
                    steps {
                       sh '''
                       mvn clean install
                          '''
                          }
                        }
        stage ('unit test') {
                        steps {
                        jacoco()
                              }
                            }
        stage ('testing') {
                      steps {
                      echo "this is kumar"
                            }
                          }  
        stage ('production') {
            steps {
                echo "prod"
            }
        }
        }
        }
