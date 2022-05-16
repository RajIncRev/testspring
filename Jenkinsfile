pipeline{
	agent any
	stages{
		stage("Build"){
			steps{
				bat "mvnw -f pom-api.xml -Dmaven.test.skip=true clean compile package"
			}
		}
	}
}