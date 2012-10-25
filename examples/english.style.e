{	scopeName = 'source.englishScript';
	fileTypes = ( 'e' );
	foldingStartMarker = '(
		 how to\s+
		|if\b .* \bthen\b
		|repeat\b .*
		|while\b .*
		|try\b .*)
	';
	foldingStopMarker = '^\s*(end|done|ok|finished|OK)\b.*$';
	
	patterns = (
		{	name = 'keyword';
			match = '\b(if|while|for|return|then|do)\b';
		},
		{	name = 'storage';
			match = '\b(let|be|less|smaller|or)\b';
		},
		{	name = 'variable.language';
			match = '\b(from|to|at|in|by|of)\b';
		},
		{	name = 'storage.type.method';
			match = '\b(if|of|a|the|default|finally|is)\b';
		},
		{	name = 'constant';
			match = '\b(true)\b';
		},
		{	name = 'comment';
			match = '//.*|#.*|/\*.*\*/|--.*';
		},
		{	name = 'constant.language';
			match = '\b(100|bla|var)\b';
		},
		{	name = 'string.quoted.double.untitled';
			begin = '"';
			end = '"';
			patterns = (
				{	name = 'constant.character.escape.untitled';
					match = '\\.';
				},
			);
		},
		{	name = 'meta.function.js';
			comment = 'match regular function like: function myFunc(arg) { … }';
			match = '\b(function|define|how to)\b\s+([a-zA-Z]+\s*)*\s*\b(a|the)\b';
			captures = {
				1 = { name = 'storage.type.function.js'; };
				2 = { name = 'entity.name.function.js'; };
				3 = { name = 'storage.type.method'; };
			};
		},
		{	include = '#code'; },
	);
}