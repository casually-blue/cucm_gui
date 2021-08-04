package controllers

import play.mvc.Controller
import play.mvc.Result
import java.io.File

class KAssets: Controller() {
    fun at(path: String, file: String): Result?{
        val f = File("$path/$file")
        return ok(f, true)
    }
}