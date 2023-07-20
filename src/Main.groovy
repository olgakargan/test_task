def countElements(List list) {
    Map result = [:]

    list.each { num ->
        result[num] = result.containsKey(num) ? result[num] + 1 : 1
    }

    return result
}

def arr = [1, 3, 4, 5, 1, 5, 4]
def counts = countElements(arr)

counts.each { key, value ->
    println(key + " : " + value)
}
