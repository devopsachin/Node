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
    sh """sudo docker build -t employee:latest ."""
    sh """ sudo kubectl apply -f `pwd`/Node/sample.yml """

  }
 return this 

