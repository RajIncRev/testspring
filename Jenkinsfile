pipeline{
	agent any
	stages{
		stage("Build"){
			steps{
				bat "mvnw -Dmaven.test.skip=true clean compile package"
			}
		}
		stage("DOcker Build"){
			steps{
				dir("src/main")
				bat "docker build --build-arg JAR_FILE=testproject-0.0.1-SNAPSHOT.jar --build-arg CONTAINER_VERSION=10.1.0 -t raj1307/testproject:10.1.0 ."
				}
		}
	}
}