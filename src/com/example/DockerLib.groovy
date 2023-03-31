// src/org/erik/dockerLib.groovy
package com.erik

class DockerLib {
    def build(Map params){
        "docker build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerContext}"

    }
    def push(Map params){
        "docker push ${params.DockerImage}"
    }
}