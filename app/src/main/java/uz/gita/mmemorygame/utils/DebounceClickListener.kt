package uz.gita.mmemorygame.utils

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun <T> debounce(
    delayMillis:Long = 600L,
    scope: CoroutineScope,
    action: (T) -> Unit
): (T) -> Unit {
    var debounceJob: Job? = null
    return { param: T ->
        if (debounceJob == null) {
            debounceJob = scope.launch {
                action(param)
                delay(delayMillis)
                debounceJob = null
            }
        }
    }
}



fun <T> debounceUntilLast(
    delayMillis: Long = 300L,
    scope: CoroutineScope,
    action: (T) -> Unit
): (T) -> Unit {
    var debounceJob: Job? = null
    return { param: T ->
        debounceJob?.cancel()
        debounceJob = scope.launch {
            delay(delayMillis)
            action(param)
        }
    }
}

