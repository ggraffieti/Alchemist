/*
 * Copyright (C) 2010-2014, Danilo Pianini and contributors
 * listed in the project's pom.xml file.
 * 
 * This file is part of Alchemist, and is distributed under the terms of
 * the GNU General Public License, with a linking exception, as described
 * in the file LICENSE in the Alchemist distribution's top directory.
 */
package it.unibo.alchemist.model.interfaces;

import it.unibo.alchemist.expressions.interfaces.ITreeNode;

import java.util.List;
import java.util.Map;

import org.danilopianini.lang.util.FasterString;


/**
 */
public interface ILsaCondition extends Condition<List<? extends ILsaMolecule>> {

    /**
     * When this method is called, the condition must filter the current matches
     * and allowed nodes.
     * 
     * @param matches
     *            current matches. This map may be modified
     * @param validNodes
     *            the list of the valid neighbors. This list may be modified
     * @param retrieved
     *            the list of the the molecules removed for each node for each
     *            possible binding
     * @return true if the condition is valid, false otherwise
     */
    boolean filter(List<Map<FasterString, ITreeNode<?>>> matches, List<? extends ILsaNode> validNodes, List<Map<ILsaNode, List<ILsaMolecule>>> retrieved);

    /*
     * (non-Javadoc)
     * 
     * @see
     * alice.alchemist.model.interfaces.Condition#cloneOnNewNode(alice.alchemist
     * .model.interfaces.Node)
     */
    @Override
    ILsaCondition cloneOnNewNode(Node<List<? extends ILsaMolecule>> n);

    /*
     * (non-Javadoc)
     * 
     * @see alice.alchemist.model.interfaces.Condition#getNode()
     */
    @Override
    ILsaNode getNode();

}
