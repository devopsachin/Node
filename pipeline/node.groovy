import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import groovy.json.JsonBuilder 

node {
  
  def rootdir="/home/ubuntu"

stage ('echoing name'){
  sh """ echo sachin"""
  }
  stage ('cloning reposatry from github'){ 
    sh """cd ${rootdir} """
    sh """ git clone https://github.com/devopsachin/Node.git """
  }
  }
 return this 

