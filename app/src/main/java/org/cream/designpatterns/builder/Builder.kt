package org.cream.designpatterns.builder

class Lol private constructor(
    private val name: String,
    private val tier: String,
    private val tierNum: Int,
    private val position: String
) {
    class Builder {
        private var name = "김근태"
        private var tier = "실버"
        private var tierNum = 4
        private var position = "미드"

        fun setName(name: String): Builder{
            this.name = name
            return this
        }

        fun setTier(tier: String): Builder{
            this.tier = tier
            return this
        }

        fun setTierNum(tierNum: Int): Builder{
            this.tierNum = tierNum
            return this
        }

        fun setPosition(position: String): Builder{
            this.position = position
            return this
        }

        fun build() = Lol(name,tier,tierNum,position)
    }

    fun printInfo() {
        println("이름 : ${name} \n티어 : ${tier} ${tierNum} \n포지션 : ${position} \n")
    }


}


