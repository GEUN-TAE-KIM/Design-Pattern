package org.cream.designpatterns.iterator

/*
이터레이터 패턴
컬렉션 구현 방법을 노출시키지 않으면서도 그 집합체 안에 들어있는
모든 항목에 접근 할 수 있는 방법을 제공하는 패턴*/

data class Car(val brand: String)

// Iterable 인터페이스를 구현
class Cars(val cars: List<Car> = listOf()) : Iterable<Car> {
    override fun iterator() = CarsIterator(cars)
}

// Iterator 인터페이스를 구현
class CarsIterator(val cars: List<Car> = listOf(), var index: Int = 0) : Iterator<Car> {
    //내부에 데이터가 존재하는지를 확인하여 반환
    override fun hasNext() = cars.size > index
    // 데이터가 존재하면 데이터를 다시 꺼내옴
    override fun next() = cars[index++]
}