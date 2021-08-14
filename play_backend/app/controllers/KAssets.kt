package controllers

import play.mvc.Controller
import play.mvc.Result
import java.io.File

class KAssets: Controller() {
    fun at(path: String, file: String): Result?{
        var loc = "$path/$file"
        loc = loc.replace("..", "")
        val f = File(loc)
        return ok(f, true)
    }
}