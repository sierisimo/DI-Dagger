package nonrelated

import sun.rmi.transport.tcp.TCPChannel
import java.util.*

fun <T> foo(str: String, t: Class<T>){

}

inline fun <reified T> blah(){
    foo("sier", T::class.java)
}

fun bar(){
    blah<StringBuilder>()
    blah<TCPChannel>()
    blah<UUID>()
}