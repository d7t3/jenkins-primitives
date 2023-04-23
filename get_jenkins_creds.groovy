// a simple way to get Jenkins credential is to define variable prior to withCredentials block and assign credential value to it.
// voila, it is be available outside of withCredentials block.
script {
    String myCred = ''
        withCredentials([string(credentialsId: 'JENKINS_CREDENTIAL', variable: 'VALUE')]) {
            myCred = VALUE
        }
    echo myCred
}
