def call (Map pipelineParams) {
    
    def dockerLib = new com.example.DockerLib()

    pipeline {
        agent any

        stages {
            
            stage('Build') {
                steps {
                    script {
                        echo "Fazendo o BUILD da imagem!"
                        sh dockerLib.build(DockerfilePath: pipelineParams.dockerfilePath,
                                           DockerImage: pipelineParams.dockerImage,
                                           DockerContext: pipelineParams.dockerContext)
                    }
                }
            }

            stage('Push') {
                steps {
                    script {
                        echo "Fazendo o PUSH da imagem!"
                        sh dockerLib.push(DockerImage: pipelineParams.dockerImage)
                    }
                }
            }
        }
    }
}