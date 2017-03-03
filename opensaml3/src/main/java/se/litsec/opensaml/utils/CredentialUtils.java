/*
 * The opensaml-ext project is an open-source package that extends OpenSAML
 * with useful extensions and utilities.
 *
 * More details on <https://github.com/litsec/opensaml-ext>
 * Copyright (C) 2017 Litsec AB
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package se.litsec.opensaml.utils;

import java.security.cert.X509Certificate;

import org.opensaml.security.credential.Credential;

/**
 * Utility methods for working with credentials (keys and certificates).
 * 
 * @author Martin Lindström (martin.lindstrom@litsec.se)
 */
public class CredentialUtils {

  public static Credential toCredential(X509Certificate cert) {
    return null;
  }
  
  // Hidden constructor.
  private CredentialUtils() {
  }

}
