 
listView('Groovy4 Jobs') {
    description('Groovy4 Jobs')
    jobs {
        regex('Groovy4_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
