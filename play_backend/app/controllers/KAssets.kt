package controllers

import play.mvc.Controller
import play.mvc.Result
import java.io.File

class KAssets: Controller() {
    fun at(path: String, file: String): Result?{
        // stop someone from accessing directories outside of path
        return ok(File("$path/$file".replace("..","")), true)
    }
}