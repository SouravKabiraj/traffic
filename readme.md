<H1>Problem Name - Mission Impossible</H1>
<ol>
<li> Vehicle related entities are kept in <b>vehicles</b> directory</li>
<li> Orbit related entities are kept in <b>orbits</b> directory</li>
<li> Implemented Facade design pattern <b>[TripGuidFacade]</b> to interact with trip guid sub-system.</li>
<li> Implemented Command design pattern to handle input commands.</li>
<li> As Undo command is not there in the given use case, It is <b>[NotImplemented].</b></li>
<li> <b>Decorator design pattern</b> is implemented for all types of orbits.</li>
</ol>

<h3>User Manual</h3>
<ol>
<li> To Compile the app : <b>mvn clean install -DskipTests -q assembly:single</b></li>
<li> To Execute the app : <b>java -jar target/geektrust.jar ./input/input.txt</b></li>
<li> Modify <b>./input/input.txt</b> to enter different commands</li>
</ol>

<i>This application is developed in java version v11</i>
