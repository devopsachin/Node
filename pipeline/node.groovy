import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import groovy.json.JsonBuilder 

node {
  
  def rootdir="/home/ubuntu"

stage ('echoing name'){
  sh """ echo sachin"""
  sh """ echo `whoami`""" 
  }
  stage ('cloning reposatry from github'){ 
    sh """ git clone https://github.com/devopsachin/Node.git """
  }
  
  stage ("deploying pod"){
  dir ("/var/lib/jenkins/workspace/node-pipline/Node"){
    sh "pwd"
    sh """ sudo kubectl apply -f sample.yml """
  }
    
  }
}
 return this 

