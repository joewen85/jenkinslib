package org.devops

def Build(buildtype, buildcommand){
  def buildtools = ["mvn":"M3","ant":"ANT","gradle":"GRADLE","npm":"NPM"]

  println(${buildtype})
  buildhome = tool buildtools[buildtype]
  sh "${buildhome}/bin/${buildtype} ${buildcommand}"
}