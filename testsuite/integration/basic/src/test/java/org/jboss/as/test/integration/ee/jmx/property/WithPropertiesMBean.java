/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.test.integration.ee.jmx.property;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author baranowb
 */
public interface WithPropertiesMBean {

    public AtomicBoolean getAtomicBoolean();

    public void setAtomicBoolean(AtomicBoolean b);

    public AtomicInteger getAtomicInteger();

    public void setAtomicInteger(AtomicInteger b);

    public AtomicLong getAtomicLong();

    public void setAtomicLong(AtomicLong b);

    public BigDecimal getBigDecimal();

    public void setBigDecimal(BigDecimal bd);

    public BigInteger getBigInteger();

    public void setBigInteger(BigInteger bigInteger);

    public boolean getBoolean();

    public void setBoolean(boolean b);

    public boolean[] getBooleanArray();

    public void setBooleanArray(boolean[] b);

    public byte getByte();

    public void setByte(byte _byte);

    public byte[] getByteArray();

    public void setByteArray(byte[] b);

    public char getChar();

    public void setChar(char _char);

    public char[] getCharacterArray();

    public void setCharacterArray(char[] b);

    public Class[] getClassArray();

    public void setClassArray(Class[] b);

    public Class getClazz();

    // cant override final method from Object :)
    public void setClazz(Class b);

    public Document getDocument();

    public void setDocument(Document b);

    public double getDouble();

    public void setDouble(double _double);

    public Element getElement();

    public void setElement(Element b);

    public File getFile();

    public void setFile(File b);

    public float getFloat();

    public void setFloat(float _float);

    public float[] getFloatArray();

    public void setFloatArray(float[] b);

    public InetAddress getInetAddress();

    public void setInetAddress(InetAddress b);

    public InetAddress[] getInetAddressArray();

    public void setInetAddressArray(InetAddress[] b);

    public int getInteger();

    public void setInteger(int _integer);

    public int[] getIntegerArray();

    public void setIntegerArray(int[] b);

    public Locale getLocale();

    public void setLocale(Locale b);

    public long getLong();

    public void setLong(long _long);

    public long[] getLongArray();

    public void setLongArray(long[] b);

    public Boolean getObjectBoolean();

    public void setObjectBoolean(Boolean objectBoolean);

    public Byte getObjectByte();

    public void setObjectByte(Byte objectByte);

    public Character getObjectChar();

    public void setObjectChar(Character objectChar);

    public Double getObjectDouble();

    public void setObjectDouble(Double objectDouble);

    public Float getObjectFloat();

    public void setObjectFloat(Float objectFloat);

    public Integer getObjectInteger();

    public void setObjectInteger(Integer objectInteger);

    public Long getObjectLong();

    public void setObjectLong(Long objectLong);

    public Short getObjectShort();

    public void setObjectShort(Short objectShort);

    public Properties getProperties();

    public void setProperties(Properties b);

    public short getShort();

    public void setShort(short _short);

    public short[] getShortArray();

    public void setShortArray(short[] b);

    public String[] getStringArray();

    public void setStringArray(String[] b);

    public URI getURI();

    public void setURI(URI b);

    public URL getURL();

    public void setURL(URL b);

    public void start() throws Exception;

    public void stop() throws Exception;

}
