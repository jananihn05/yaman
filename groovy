pipeline {
           agent {
               label 'maven'
        }
        stages {
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
