/**
 * This file is part of the neXim XMPP server
 *
 * Copyright (C) 2005-2011 Iritgo Technologies
 * Copyright (C) 2003-2005 BueroByte GbR
 * Copyright (c) 2003, OpenIM Project http://open-im.net
 *
 * Iritgo licenses this file to You under the BSD License
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * BSD License http://www.opensource.org/licenses/bsd-license.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.iritgo.nexim.xmpp.jabber.iq.auth;


import de.iritgo.nexim.session.DefaultSessionProcessor;
import de.iritgo.nexim.session.IMClientSession;
import de.iritgo.nexim.session.IMSession;


public class UsernameImpl extends DefaultSessionProcessor implements Username
{
	@Override
	public void processText(final IMSession session, final Object context) throws Exception
	{
		((IMClientSession) session).getUser().setName(session.getXmlPullParser().getText().trim().toLowerCase());
	}
}
