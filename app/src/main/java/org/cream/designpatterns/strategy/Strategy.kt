package org.cream.designpatterns.strategy

/*
스트래티지 패턴
행위를 클래스로 캡슐화해 동적으로 행위를 자유롭게 바꿀 수 있게 해주는 패턴
*/

interface Weapon {
    fun attack(action: String)
}

class Knife : Weapon {
    override fun attack(action: String) {
        println("$action 칼로 공격")
    }
}

class Gun : Weapon {
    override fun attack(action: String) {
        println("$action 총으로 공격")
    }
}

class Character {
    private lateinit var weapon: Weapon

    fun setWeapon(weapon: Weapon) {
        this.weapon = weapon
    }

    fun attack() {
        weapon.attack("공격 행위:")
    }
}