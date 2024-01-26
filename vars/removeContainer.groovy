def call(){
    sh 'docker container rm -f youtube'
    sh 'docker image rm -f melophile/youtube:latest'
}
