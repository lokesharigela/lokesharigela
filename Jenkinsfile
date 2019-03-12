
pipeline {
	agent any
	stages {
		stage ('build') {
			sh 'echo "Build stage"'
		}
		stage ('test: integration-&-quality') {
			sh 'echo "Test stage"'
		}
		stage ('test: functional') {
			sh 'echo " Test functional stage"'
		}
		stage ('test: load-&-security') {
			sh 'echo " security stage"'
		}
		stage ('approval') {
			sh 'echo " approval stage"'
		}
		stage ('deploy:prod') {
			sh 'echo " deploy stage"'
			
		}
	}
}
