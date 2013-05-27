package org.ollabaca.on.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;

public class Visitor implements IResourceVisitor {

	Collection<IFile> files = new ArrayList<>();

	@Override
	public boolean visit(IResource resource) throws CoreException {
		if (resource instanceof IFile) {
			if (resource.getName().endsWith(".on")) {
				this.files.add((IFile) resource);
			}
		}
		return true;
	}

	public Collection<IFile> getFiles() {
		return files;
	}

}
