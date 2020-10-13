package org.devops

def Build(buildtype, buildcommand){
  def buildtools = ["mvn":"M3","ant":"ANT","gradle":"GRADLE","npm":"NPM"]

  println("当前选择的构建类型为: ${buildtype}")
  buildhome = tool buildtools[buildtype]

  if (buildtype="npm"){
    sh "export NODE_HOME=${npmhome} && PATH=\$NODE_HOME/bin:\$PATH && ${npmhome}/bin/node ${build_command}"
  } else {
    sh "${buildhome}/bin/${buildtype} ${buildcommand}"
  } 
}