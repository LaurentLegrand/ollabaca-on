package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.Element
import org.ollabaca.on.site.util.Template

class Body extends Template<Element> {

	public static val Body instance = new Body()

	static def body_Element(Element self) {
		instance.transform(self)
	}

	override def CharSequence doFallback(Element self) '''
		<body>
			<div class="navbar navbar-inverse navbar-fixed-top">
				<div class="navbar-inner">
					<div class="container-fluid">
						<button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="brand" href="/site">Home</a>
						<div class="nav-collapse collapse">
							<p class="navbar-text pull-right">
								Logged in as <a href="#" class="navbar-link">Username</a>
							</p>
							<ul class="nav">
		«««									<li class="active"><a href="#">Home</a></li>
								<li><a href="#about">About</a></li>
								<li><a href="#contact">Contact</a></li>
							</ul>
						</div><!--/.nav-collapse -->
					</div>
				</div>
			</div>
	
			<div class="container-fluid">
				<div class='row-fluid'>
					<div class="span3 well">
						«Aside::aside_Element(self)»
					</div>
					<div id="content" class="span9">
						«Main::main_Element(self)»
					</div>
				</div>
			</div>
		</body>
	'''
	
}
