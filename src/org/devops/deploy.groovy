package org.devops

def saltdeploy(host, func){
  sh "salt ${host} ${host}"
}

def ansibledeploy(host, func){
  sh "ansible ${func} ${host}"
}