# SampleDiffUtilLintError
Sample to reproduce the false positive throw by AndroidLint when using a sealed class in another module
The lint in question is produced by DiffUtilDetector.kt

`
 Error: Suspicious equality check: equals() is not implemented in Food [DiffUtilEquals]
                  return oldItem == newItem
`

To reproduce just launch `./gradlew :app:lintDebug`
