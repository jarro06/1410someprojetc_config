 
listView('1410someprojetc Jobs') {
    description('1410someprojetc Jobs')
    jobs {
        regex('1410someprojetc_.+')
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
