Name            Description                         Scala type
Invariant       C[T'] and C[T] are not related      C[T]
Covariant       C[T'] is a subclass of C[T]         C[+T]
Contravariant   C[T] is a subclass of C[T']         C[-T]

covariant type parameters can only appear in method results
contravariant type parameters can only appear in method parameters
invariant type parameters can appear anywhere

