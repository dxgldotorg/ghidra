/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.pcode.emu.jit.op;

import java.util.List;

import ghidra.pcode.emu.jit.JitPassage.RBranch;
import ghidra.pcode.emu.jit.analysis.JitTypeBehavior;
import ghidra.pcode.emu.jit.var.JitVal;
import ghidra.program.model.pcode.PcodeOp;

/**
 * The use-def node for a {@link PcodeOp#BRANCH}.
 * 
 * @param op the p-code op
 * @param branch the branch record created for the p-code op
 */
public record JitBranchOp(PcodeOp op, RBranch branch) implements JitOp {

	@Override
	public boolean canBeRemoved() {
		return false;
	}

	@Override
	public void link() {
		// Nothing
	}

	@Override
	public void unlink() {
		// Nothing
	}

	@Override
	public List<JitVal> inputs() {
		return List.of();
	}

	@Override
	public JitTypeBehavior typeFor(int position) {
		throw new AssertionError();
	}
}
