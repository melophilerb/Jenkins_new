def call(){
    sh "docker run -d --name youtube -p 80:3000 --restart always melophilerb/youtube:latest"
}
