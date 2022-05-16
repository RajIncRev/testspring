pipeline{
	agent any
	stages{
		stage("Build"){
			steps{
				sh "mvnw -f pom-api.xml -Dmaven.test.skip=true clean compile package"
			}
		}
	}
}