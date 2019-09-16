job("Maven Test") {

    scm {
        github('dorees/spring-petclinic')
    }

    steps {
        maven('verify')
    }
}