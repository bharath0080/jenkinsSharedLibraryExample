package com

class Newform{
	def jenkins
	
	Newform() throws Exception{
		throw new Exception("'this' must be passed when creating new class instance e.g. new Classname(this) instead of new Classname(). " +
      "This enables access to jenkinsfile steps, global variables, functions and envvars.")
	}
	Newform(jenkins){
		this.jenkins=jenkins
	}
	
	def methodName(Map<String, Object> params){
		def defaults = [
		testing : "defaultValue"
		]
		def config = defaults + params
		jenkins.echo "methodName arguments : $config"
		jenkins.echo "${jenkins.env.BUILD_ID},${jenkins.env.JOB_URL}"
	}
}
