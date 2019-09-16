job("Maven Test") {

    scm {
        branch("master")
        remote {
            name("origin")
            url("https://github.com/dorees/spring-petclinic.git")
        }
    }

    steps {
        maven('test')
    }
}