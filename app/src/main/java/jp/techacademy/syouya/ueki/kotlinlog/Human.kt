
    package jp.techacademy.syouya.ueki.kotlinlog

    import android.util.Log
            open class Human:Animal, Thinkble{
        //プロパティ

        var hobby :String

//引数付きコンストラクタ

        constructor(name: String, age: Int, hobby:String) : super(name, age) {
            this.hobby = "メソッド"
            this.name = name
            this.age = age
        }
        //Animalクラスのメソッドをオーバーライド
        override fun say() {
            Log.d("kotlintest",   "「私の名前は " + this.name + "です。" + "年は"  + this.age + "歳です。」")
        }

        //thinkbleインターフェースのメソッドをオーバーライド
        override fun think() {
            Log.d("kotlintest",  "「私は" +  this.hobby + "について考える。" )




        }
    }
