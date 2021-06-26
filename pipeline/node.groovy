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
    sh """cd ${rootdir} """
    sh """echo `pwd`"""
    sh """ git clone https://github.com/devopsachin/Node.git """
  }
  
  stage ("deploying pod"){
    sh """ kubectl apply -f `pwd`/Node/sample.yml """
  }
  
  
  }
 return this 

