package example.micronaut
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue

@Controller
open class HomeController {
    @Get(value = "/mypath")
    fun index(@QueryValue(value = "param") param: String) = mapOf("param" to param)
}