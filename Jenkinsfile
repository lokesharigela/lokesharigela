
pipeline {
	agent any
	stages {
		stage ('build') {
			echo " Build stage"
		}
		stage ('test: integration-&-quality') {
			echo " Test stage"
		}
		stage ('test: functional') {
			echo " Test functional stage"
		}
		stage ('test: load-&-security') {
			echo " security stage"
		}
		stage ('approval') {
			echo " approval stage"
		}
		stage ('deploy:prod') {
			echo " deploy stage"
			
		}
	}
}
