/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/kernel/tags/kernel-1.3.2/api/src/main/java/org/sakaiproject/entity/api/ContextObserver.java $
 * $Id: ContextObserver.java 79497 2010-07-15 15:33:23Z david.horwitz@uct.ac.za $
 ***********************************************************************************
 *
 * Copyright (c) 2006, 2008 Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.entity.api;

/**
 * <p>
 * Services which implement ContextObserver declare themselves as wanting context change notification.
 * </p>
 */
public interface ContextObserver
{
	/**
	 * This is called when a context is first created.
	 * 
	 * @param context
	 *        The context id.
	 * @param toolPlacement
	 *        true if one of your tool is placed in the context.
	 */
	void contextCreated(String context, boolean toolPlacement);

	/**
	 * This is called when a context is changed.
	 * 
	 * @param context
	 *        The context id.
	 * @param toolPlacement
	 *        true if one of your tool is placed in the context after the change.
	 */
	void contextUpdated(String context, boolean toolPlacement);

	/**
	 * This is called when a context is being deleted.
	 * 
	 * @param context
	 *        The context id.
	 * @param toolPlacement
	 *        true if one of your tool is placed in the context after the change.
	 */
	void contextDeleted(String context, boolean toolPlacement);

	/**
	 * Provide the string array of tool ids, for tools that we need context preperation for.
	 * 
	 * @return
	 */
	String[] myToolIds();
}
