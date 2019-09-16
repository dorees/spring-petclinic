job("Maven Test") {

    steps {
        maven('verify')

        maven {
            goals('test')
            golas('package')
        }
    }
}