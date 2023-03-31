# jenkins-libs-model
Modelo de Jenkins Libs para usar nas pipelines!

### Modelo do jenkinsfile
´´´
@Library('jenkins-libs-model') _
apiRestFulPipeline(
	dockerfilePath: "Dockerfile",
	dockerImage: "username/image_api_restfull_flask:1.0.0-${BUILD_ID}",
	dockerContext: "."
)
´´´
