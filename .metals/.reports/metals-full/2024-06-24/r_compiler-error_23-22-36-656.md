file:///C:/Users/USER/Downloads/SCS%202204%20Functional%20Pragramming%20Practicals/Scala-Lab-session-2/Q3_Functions.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition salCalc is defined in
  C:/Users/USER/Downloads/SCS 2204 Functional Pragramming Practicals/Scala-Lab-session-2/Q3.scala
and also in
  C:/Users/USER/Downloads/SCS 2204 Functional Pragramming Practicals/Scala-Lab-session-2/Q3_Get_User_Inputs.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\oss.sonatype.org\content\repositories\public\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 285
uri: file:///C:/Users/USER/Downloads/SCS%202204%20Functional%20Pragramming%20Practicals/Scala-Lab-session-2/Q3_Functions.scala
text:
```scala
def OT_salary() : Float = {
    85 * 30
}

def normal_salary() : Float = {
    250 * 40
}

def gross_salary() : Float = {
    OT_salary() + normal_salary()
}

def tax() : Float = {
    gross_salary() * 0.12
}

def net_salary() : Float = {
    gross_salary() - tax()
z@@}




```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition salCalc is defined in
  C:/Users/USER/Downloads/SCS 2204 Functional Pragramming Practicals/Scala-Lab-session-2/Q3.scala
and also in
  C:/Users/USER/Downloads/SCS 2204 Functional Pragramming Practicals/Scala-Lab-session-2/Q3_Get_User_Inputs.scala
One of these files should be removed from the classpath.