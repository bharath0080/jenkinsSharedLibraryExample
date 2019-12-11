@Library("example-lib-other-form") _
pipeline{
	agent {
		label "master"
	}
	stages{
		stage("test"){
			steps{
				testingOtherForm varName1:"bharath",varName2:"kumar"
			}
		}
	}
}
