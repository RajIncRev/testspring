pipeline{
	agent any
	stages{
		stage("Build"){
			steps{
				bat "mvnw -Dmaven.test.skip=true clean compile package"
			}
		}
	}
}