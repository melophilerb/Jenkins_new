def call() {
    sh 'trivy image melophile/youtube:latest > trivyimage.txt'
}
